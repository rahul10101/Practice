import java.io.IOException;
import java.nio.ByteOrder;

import javax.imageio.stream.IIOByteBuffer;
import javax.imageio.stream.ImageOutputStream;

public class File implements ImageOutputStream {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getBitOffset() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ByteOrder getByteOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getFlushedPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getStreamPosition() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCached() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCachedFile() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCachedMemory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long length() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mark() {
		// TODO Auto-generated method stub

	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int read(byte[] arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int read(byte[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int readBit() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long readBits(int arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean readBoolean() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public byte readByte() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void readBytes(IIOByteBuffer arg0, int arg1) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public char readChar() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double readDouble() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float readFloat() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void readFully(byte[] arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(byte[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(short[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(char[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(int[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(long[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(float[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readFully(double[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public int readInt() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long readLong() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short readShort() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String readUTF() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int readUnsignedByte() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long readUnsignedInt() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int readUnsignedShort() throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reset() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void seek(long arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBitOffset(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setByteOrder(ByteOrder arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public int skipBytes(int arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long skipBytes(long arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void flushBefore(long arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(byte[] arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeBit(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeBits(long arg0, int arg1) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeBoolean(boolean arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeByte(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeBytes(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeChar(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeChars(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeChars(char[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeDouble(double arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeDoubles(double[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeFloat(float arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeFloats(float[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeInt(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeInts(int[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeLong(long arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeLongs(long[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeShort(int arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeShorts(short[] arg0, int arg1, int arg2) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeUTF(String arg0) throws IOException {
		// TODO Auto-generated method stub

	}

}
