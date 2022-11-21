import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aksn extends ahcz implements aheo
{
    public static final aksn a;
    private static volatile ahev h;
    public int b;
    public aknh c;
    public int d;
    public akzf e;
    public String f;
    public boolean g;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aksn.class, a = new aksn());
    }
    
    private aksn() {
        this.i = 2;
        this.f = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = aksn.h) == null) {
                    synchronized (aksn.class) {
                        if (aksn.h == null) {
                            aksn.h = (ahev)new ahcs((ahcz)aksn.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aksn.a;
            }
            case 4: {
                return new ahcr((ahcz)aksn.a);
            }
            case 3: {
                return new aksn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aksn.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1008\u0003\u0004\u1007\u0004\u0005\u100c\u0001", new Object[] { "b", "c", "e", "f", "g", "d", anus.b });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
