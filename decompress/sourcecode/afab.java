import java.util.ArrayList;
import java.util.Collection;
import java.io.ObjectOutputStream;
import java.util.List;
import java.io.ObjectInputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afab extends aezb
{
    private static final long serialVersionUID = 0L;
    transient int c;
    
    private afab() {
        super((Map)afau.f(12));
        ahbz.ay(3, "expectedValuesPerKey");
        this.c = 3;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = 3;
        final int int1 = objectInputStream.readInt();
        ((aezr)this).n((Map)afau.e());
        for (int i = 0; i < int1; ++i) {
            final List e = this.e(objectInputStream.readObject());
            for (int int2 = objectInputStream.readInt(), j = 0; j < int2; ++j) {
                e.add(objectInputStream.readObject());
            }
        }
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        aesy.v((affl)this, objectOutputStream);
    }
    
    public static afab y() {
        return new afab();
    }
}
