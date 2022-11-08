import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apea extends agzi implements ahax
{
    public static final apea a;
    private static volatile ahbe e;
    public int b;
    public akjf c;
    public aioe d;
    private ajtl f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(apea.class, a = new apea());
    }
    
    private apea() {
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
                if ((e = apea.e) == null) {
                    synchronized (apea.class) {
                        if (apea.e == null) {
                            apea.e = (ahbe)new agzb((agzi)apea.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apea.a;
            }
            case 4: {
                return new agza((agzi)apea.a);
            }
            case 3: {
                return new apea();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apea.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "b", "c", "d", "f" });
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
