import java.util.Iterator;
import java.io.ObjectOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.util.Map;
import java.io.Externalizable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atkw implements Externalizable
{
    private static final long serialVersionUID = 0L;
    private Map a;
    
    public atkw() {
        throw null;
    }
    
    public atkw(final Map a) {
        this.a = a;
    }
    
    private final Object readResolve() {
        return this.a;
    }
    
    @Override
    public final void readExternal(final ObjectInput objectInput) {
        objectInput.getClass();
        final byte byte1 = objectInput.readByte();
        if (byte1 != 0) {
            final StringBuilder sb = new StringBuilder("Unsupported flags value: ");
            sb.append(byte1);
            throw new InvalidObjectException(sb.toString());
        }
        final int int1 = objectInput.readInt();
        if (int1 >= 0) {
            final atks a = new atks(int1);
            for (int i = 0; i < int1; ++i) {
                a.put(objectInput.readObject(), objectInput.readObject());
            }
            a.k();
            this.a = a;
            return;
        }
        final StringBuilder sb2 = new StringBuilder("Illegal size value: ");
        sb2.append(int1);
        sb2.append('.');
        throw new InvalidObjectException(sb2.toString());
    }
    
    @Override
    public final void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(((atks)this.a).e);
        for (final Map.Entry<Object, V> entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
