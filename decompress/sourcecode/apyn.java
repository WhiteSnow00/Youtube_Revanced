import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyn extends agzi implements ahax
{
    public static final apyn a;
    private static volatile ahbe d;
    public long b;
    public long c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apyn.class, a = new apyn());
    }
    
    private apyn() {
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
                if ((d = apyn.d) == null) {
                    synchronized (apyn.class) {
                        if (apyn.d == null) {
                            apyn.d = (ahbe)new agzb((agzi)apyn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyn.a;
            }
            case 4: {
                return new agza((agzi)apyn.a);
            }
            case 3: {
                return new apyn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
