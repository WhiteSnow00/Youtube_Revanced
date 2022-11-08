import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomv extends agzi implements ahax
{
    public static final aomv a;
    private static volatile ahbe d;
    public int b;
    public aomu c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aomv.class, (agzi)(a = new aomv()));
    }
    
    private aomv() {
        this.e = 2;
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
                if ((d = aomv.d) == null) {
                    synchronized (aomv.class) {
                        if (aomv.d == null) {
                            aomv.d = (ahbe)new agzb((agzi)aomv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomv.a;
            }
            case 4: {
                return new agza((agzi)aomv.a);
            }
            case 3: {
                return new aomv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomv.a, "\u0001\u0001\u0000\u0001\ue545\u367b\ue545\u367b\u0001\u0000\u0000\u0001\ue545\u367b\u1409\u0000", new Object[] { "b", "c" });
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
