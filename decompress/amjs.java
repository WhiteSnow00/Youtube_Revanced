import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjs extends ahcz implements aheo
{
    public static final amjs a;
    private static volatile ahev i;
    public int b;
    public akfj c;
    public int d;
    public String e;
    public ahbt f;
    public ahkb g;
    public aisc h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(amjs.class, a = new amjs());
    }
    
    private amjs() {
        this.k = 2;
        this.e = "";
        this.f = ahbt.b;
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = amjs.i) == null) {
                    synchronized (amjs.class) {
                        if (amjs.i == null) {
                            amjs.i = (ahev)new ahcs((ahcz)amjs.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amjs.a;
            }
            case 4: {
                return new ahcr((ahcz)amjs.a);
            }
            case 3: {
                return new amjs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjs.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u100c\u0002\u0003\u1008\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u1009\u0007\n\u1409\t", new Object[] { "b", "c", "d", amgw.o, "e", "j", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
