import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apei extends agzi implements ahax
{
    public static final apei a;
    public static final agzg b;
    private static volatile ahbe d;
    public anss c;
    private int e;
    private byte f;
    
    static {
        final apei a2 = new apei();
        agzi.registerDefaultInstance(apei.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 163531772, ahcm.k, apei.class);
    }
    
    private apei() {
        this.f = 2;
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
                if ((d = apei.d) == null) {
                    synchronized (apei.class) {
                        if (apei.d == null) {
                            apei.d = (ahbe)new agzb((agzi)apei.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apei.a;
            }
            case 4: {
                return new agza((agzi)apei.a);
            }
            case 3: {
                return new apei();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apei.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
