package com.poonia.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class TestPathInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:/Users");
		FileSystem fileSystem = path.getFileSystem();
		try (WatchService watchService = fileSystem.newWatchService();) {

			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_MODIFY,
					StandardWatchEventKinds.ENTRY_DELETE);
			while (true) {
				try {

					WatchKey watchKey = watchService.take();
					for (@SuppressWarnings("rawtypes")
					WatchEvent event : watchKey.pollEvents()) {
						System.out
								.println(event.kind() + " " + event.context());
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
