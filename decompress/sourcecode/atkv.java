import java.util.Iterator;
import java.io.ObjectOutput;
import java.util.List;
import java.util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.util.Collection;
import java.io.Externalizable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkv implements Externalizable
{
    private static final long serialVersionUID = 0L;
    private Collection a;
    private final int b;
    
    public atkv() {
        throw null;
    }
    
    public atkv(final Collection a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private final Object readResolve() {
        return this.a;
    }
    
    @Override
    public final void readExternal(final ObjectInput objectInput) {
        objectInput.getClass();
        final byte byte1 = objectInput.readByte();
        if ((byte1 & 0xFFFFFFFE) != 0x0) {
            final StringBuilder sb = new StringBuilder("Unsupported flags value: ");
            sb.append(byte1);
            sb.append('.');
            throw new InvalidObjectException(sb.toString());
        }
        final int int1 = objectInput.readInt();
        if (int1 >= 0) {
            final int n = 0;
            int i = 0;
            Collection a;
            if ((byte1 & 0x1) != 0x0) {
                final atkx atkx = new atkx(new atks(int1));
                while (i < int1) {
                    ((Set<Object>)atkx).add(objectInput.readObject());
                    ++i;
                }
                atva.i((Set)atkx);
                a = (Collection)atkx;
            }
            else {
                final atkn atkn = new atkn(int1);
                for (int j = n; j < int1; ++j) {
                    ((List<Object>)atkn).add(objectInput.readObject());
                }
                aqzg.P((List)atkn);
                a = (Collection)atkn;
            }
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
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            objectOutput.writeObject(iterator.next());
        }
    }
}
