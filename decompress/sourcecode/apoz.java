import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoz extends agzi implements ahax
{
    public static final apoz a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apoz.class, (agzi)(a = new apoz()));
    }
    
    private apoz() {
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
                if ((d = apoz.d) == null) {
                    synchronized (apoz.class) {
                        if (apoz.d == null) {
                            apoz.d = (ahbe)new agzb((agzi)apoz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apoz.a;
            }
            case 4: {
                return new agza((agzi)apoz.a);
            }
            case 3: {
                return new apoz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoz.a, "\u0001\u0004\u0001\u0000\uf3bf\u17d3\ue0ef\u3f6a\u0004\u0000\u0000\u0004\uf3bf\u17d3\u143c\u0000\ufc6c\u17d3\u143c\u0000\uea0c\u3a83\u143c\u0000\ue0ef\u3f6a\u143c\u0000", new Object[] { "c", "b", appa.class, apps.class, appd.class, aoid.class });
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
