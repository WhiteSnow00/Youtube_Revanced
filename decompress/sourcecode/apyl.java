import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyl extends agzi implements ahax
{
    public static final apyl a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apyl.class, a = new apyl());
    }
    
    private apyl() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apyl.c) == null) {
                    synchronized (apyl.class) {
                        if (apyl.c == null) {
                            apyl.c = (ahbe)new agzb((agzi)apyl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apyl.a;
            }
            case 4: {
                return new agza((agzi)apyl.a);
            }
            case 3: {
                return new apyl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyl.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
