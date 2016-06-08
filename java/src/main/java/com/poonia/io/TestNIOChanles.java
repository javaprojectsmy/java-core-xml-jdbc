package com.poonia.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestNIOChanles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (FileInputStream fis = new FileInputStream(
				"./src/com/java8/tesco/core/Customer.java")) {
			FileChannel inChannel = fis.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(48);

			int byteRead = inChannel.read(buffer);

			while (byteRead != -1) {
				// buffer.flip();//-1 for EOF(end Of File)
				// flip to make buffer ready
				while (buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}

				buffer.compact();// make buffer available for writing
				byteRead = inChannel.read(buffer);
				// byteRead=inChannel.write(buffer);
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
