import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akno extends agzi implements ahax
{
    public static final akno a;
    private static volatile ahbe f;
    public int b;
    public ajsq c;
    public ajsq d;
    public long e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akno.class, a = new akno());
    }
    
    private akno() {
        this.g = 2;
    }
    
    @Override
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
                if ((f = akno.f) == null) {
                    synchronized (akno.class) {
                        if (akno.f == null) {
                            akno.f = (ahbe)new agzb((agzi)akno.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akno.a;
            }
            case 4: {
                return new agza((agzi)akno.a);
            }
            case 3: {
                return new akno();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akno.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1003\u0002", new Object[] { "b", "c", "d", "e" });
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
