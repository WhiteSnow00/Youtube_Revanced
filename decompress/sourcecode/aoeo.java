import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoeo extends agzi implements ahax
{
    public static final aoeo a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoeo.class, a = new aoeo());
    }
    
    private aoeo() {
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
                if ((d = aoeo.d) == null) {
                    synchronized (aoeo.class) {
                        if (aoeo.d == null) {
                            aoeo.d = (ahbe)new agzb((agzi)aoeo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoeo.a;
            }
            case 4: {
                return new agza((agzi)aoeo.a);
            }
            case 3: {
                return new aoeo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoeo.a, "\u0001\u0001\u0001\u0000\ue1ae\u38da\ue1ae\u38da\u0001\u0000\u0000\u0001\ue1ae\u38da\u143c\u0000", new Object[] { "c", "b", aokx.class });
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
