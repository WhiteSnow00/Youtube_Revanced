import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqo extends agzi implements ahax
{
    public static final aoqo a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoqo.class, a = new aoqo());
    }
    
    private aoqo() {
        this.b = 0;
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
                if ((d = aoqo.d) == null) {
                    synchronized (aoqo.class) {
                        if (aoqo.d == null) {
                            aoqo.d = (ahbe)new agzb((agzi)aoqo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoqo.a;
            }
            case 4: {
                return new agza((agzi)aoqo.a);
            }
            case 3: {
                return new aoqo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqo.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u143c\u0000\u0002\u103a\u0000", new Object[] { "c", "b", ajsq.class });
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
