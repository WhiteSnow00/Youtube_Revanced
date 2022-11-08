import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlw extends agzi implements ahax
{
    public static final ajlw a;
    private static volatile ahbe d;
    public int b;
    public ajlx c;
    private ajly e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ajlw.class, (agzi)(a = new ajlw()));
    }
    
    private ajlw() {
        this.f = 2;
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
                if ((d = ajlw.d) == null) {
                    synchronized (ajlw.class) {
                        if (ajlw.d == null) {
                            ajlw.d = (ahbe)new agzb((agzi)ajlw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajlw.a;
            }
            case 4: {
                return new agza((agzi)ajlw.a);
            }
            case 3: {
                return new ajlw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlw.a, "\u0001\u0002\u0000\u0001\uf339\u1708\uf395\u1708\u0002\u0000\u0000\u0002\uf339\u1708\u1409\u0001\uf395\u1708\u1409\u0000", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
