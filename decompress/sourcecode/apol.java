import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apol extends agzi implements ahax
{
    public static final apol a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public akbf d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)apol.class, (agzi)(a = new apol()));
    }
    
    private apol() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apol.f) == null) {
                    synchronized (apol.class) {
                        if (apol.f == null) {
                            apol.f = (ahbe)new agzb((agzi)apol.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apol.a;
            }
            case 4: {
                return new agza((agzi)apol.a);
            }
            case 3: {
                return new apol();
            }
            case 2: {
                return newMessageInfo((MessageLite)apol.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", apms.n });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
