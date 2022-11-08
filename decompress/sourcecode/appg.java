import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appg extends agzi implements ahax
{
    public static final appg a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)appg.class, (agzi)(a = new appg()));
    }
    
    private appg() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = appg.d) == null) {
                    synchronized (appg.class) {
                        if (appg.d == null) {
                            appg.d = (ahbe)new agzb((agzi)appg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appg.a;
            }
            case 4: {
                return new agza((agzi)appg.a);
            }
            case 3: {
                return new appg();
            }
            case 2: {
                return newMessageInfo((MessageLite)appg.a, "\u0001\u0005\u0001\u0000\ue018\u17aa\ueea5\u37f3\u0005\u0000\u0000\u0005\ue018\u17aa\u143c\u0000\ufa4c\u17d2\u143c\u0000\uf74f\u2a6b\u143c\u0000\uf415\u3337\u143c\u0000\ueea5\u37f3\u143c\u0000", new Object[] { "c", "b", apow.class, appv.class, akac.class, appu.class, apou.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
