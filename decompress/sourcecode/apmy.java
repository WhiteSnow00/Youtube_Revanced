import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmy extends agzi implements ahax
{
    public static final apmy a;
    private static volatile ahbe c;
    public amva b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apmy.class, (agzi)(a = new apmy()));
    }
    
    private apmy() {
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
                final ahbe c;
                if ((c = apmy.c) == null) {
                    synchronized (apmy.class) {
                        if (apmy.c == null) {
                            apmy.c = (ahbe)new agzb((agzi)apmy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apmy.a;
            }
            case 4: {
                return new agza((agzi)apmy.a);
            }
            case 3: {
                return new apmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmy.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "d", "b" });
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
