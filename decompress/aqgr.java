import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgr extends ahcu implements ahcv
{
    public static final aqgr a;
    private static volatile ahev b;
    private int c;
    private aqiq d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aqgr.class, (ahcz)(a = new aqgr()));
    }
    
    private aqgr() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aqgr.b) == null) {
                    synchronized (aqgr.class) {
                        if (aqgr.b == null) {
                            aqgr.b = (ahev)new ahcs((ahcz)aqgr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqgr.a;
            }
            case 4: {
                return new ahct((ahcu)aqgr.a);
            }
            case 3: {
                return new aqgr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgr.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
