import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxj extends agzi implements ahax
{
    public static final apxj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apxj.class, a = new apxj());
    }
    
    private apxj() {
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
                if ((d = apxj.d) == null) {
                    synchronized (apxj.class) {
                        if (apxj.d == null) {
                            apxj.d = (ahbe)new agzb((agzi)apxj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxj.a;
            }
            case 4: {
                return new agza((agzi)apxj.a);
            }
            case 3: {
                return new apxj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxj.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u103c\u0000\u0003\u143c\u0000", new Object[] { "c", "b", apxk.class, apxm.class, apxl.class });
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
