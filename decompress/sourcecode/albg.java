import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albg extends agzi implements ahax
{
    public static final albg a;
    private static volatile ahbe d;
    public akjf b;
    public anss c;
    private int e;
    private ajtl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)albg.class, (agzi)(a = new albg()));
    }
    
    private albg() {
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
                final ahbe d;
                if ((d = albg.d) == null) {
                    synchronized (albg.class) {
                        if (albg.d == null) {
                            albg.d = (ahbe)new agzb((agzi)albg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return albg.a;
            }
            case 4: {
                return new agza((agzi)albg.a);
            }
            case 3: {
                return new albg();
            }
            case 2: {
                return newMessageInfo((MessageLite)albg.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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
