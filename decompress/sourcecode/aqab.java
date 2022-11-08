import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqab extends agzi implements ahax
{
    public static final aqab a;
    private static volatile ahbe f;
    public int b;
    public aqac c;
    public aqak d;
    public aqal e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aqab.class, a = new aqab());
    }
    
    private aqab() {
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
                final ahbe f;
                if ((f = aqab.f) == null) {
                    synchronized (aqab.class) {
                        if (aqab.f == null) {
                            aqab.f = (ahbe)new agzb((agzi)aqab.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqab.a;
            }
            case 4: {
                return new agza((agzi)aqab.a);
            }
            case 3: {
                return new aqab();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqab.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
