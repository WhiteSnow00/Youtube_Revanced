import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqci extends ahcz implements aheo
{
    public static final aqci a;
    private static volatile ahev f;
    public int b;
    public String c;
    public aisc d;
    public aisc e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqci.class, a = new aqci());
    }
    
    private aqci() {
        this.g = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqci.f) == null) {
                    synchronized (aqci.class) {
                        if (aqci.f == null) {
                            aqci.f = (ahev)new ahcs((ahcz)aqci.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqci.a;
            }
            case 4: {
                return new ahcr((ahcz)aqci.a);
            }
            case 3: {
                return new aqci();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqci.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
