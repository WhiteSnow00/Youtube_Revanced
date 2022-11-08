import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmz extends agzi implements ahax
{
    public static final ahmz a;
    private static volatile ahbe e;
    public aioe b;
    public int c;
    public int d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahmz.class, a = new ahmz());
    }
    
    private ahmz() {
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
                final ahbe e;
                if ((e = ahmz.e) == null) {
                    synchronized (ahmz.class) {
                        if (ahmz.e == null) {
                            ahmz.e = (ahbe)new agzb((agzi)ahmz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmz.a;
            }
            case 4: {
                return new agza((agzi)ahmz.a);
            }
            case 3: {
                return new ahmz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahmz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
