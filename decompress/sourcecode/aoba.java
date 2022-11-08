import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoba extends agzi implements ahax
{
    public static final aoba a;
    private static volatile ahbe b;
    private int c;
    private aobn d;
    private aoaz e;
    private ajsq f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aoba.class, a = new aoba());
    }
    
    private aoba() {
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
                final ahbe b2;
                if ((b2 = aoba.b) == null) {
                    synchronized (aoba.class) {
                        if (aoba.b == null) {
                            aoba.b = (ahbe)new agzb((agzi)aoba.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aoba.a;
            }
            case 4: {
                return new agza((agzi)aoba.a);
            }
            case 3: {
                return new aoba();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoba.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f" });
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
