import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxz extends agzi implements ahax
{
    public static final apxz a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apxz.class, a = new apxz());
    }
    
    private apxz() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apxz.d) == null) {
                    synchronized (apxz.class) {
                        if (apxz.d == null) {
                            apxz.d = (ahbe)new agzb((agzi)apxz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxz.a;
            }
            case 4: {
                return new agza((agzi)apxz.a);
            }
            case 3: {
                return new apxz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}