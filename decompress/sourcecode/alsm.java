import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsm extends agzi implements ahax
{
    public static final alsm a;
    private static volatile ahbe d;
    public int b;
    public alsk c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(alsm.class, a = new alsm());
    }
    
    private alsm() {
        this.e = 2;
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
                final ahbe d;
                if ((d = alsm.d) == null) {
                    synchronized (alsm.class) {
                        if (alsm.d == null) {
                            alsm.d = (ahbe)new agzb((agzi)alsm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alsm.a;
            }
            case 4: {
                return new agza((agzi)alsm.a);
            }
            case 3: {
                return new alsm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsm.a, "\u0001\u0001\u0000\u0001\uee84\u3cd6\uee84\u3cd6\u0001\u0000\u0000\u0001\uee84\u3cd6\u1409\u0000", new Object[] { "b", "c" });
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
