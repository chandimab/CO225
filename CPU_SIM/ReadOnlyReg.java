import java.io.IOException;

class ReadOnlyReg extends RegBase {

    public ReadOnlyReg() { //hard wired to 0
		value = 0;
    }

    public void writeReg(int value) throws IOException {
	    throw new IOException("Can not write to a readonly reg");
    }

}
