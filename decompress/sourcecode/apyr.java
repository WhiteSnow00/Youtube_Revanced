import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyr extends agzi implements ahax
{
    public static final apyr a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apyr.class, a = new apyr());
    }
    
    private apyr() {
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
                if ((c = apyr.c) == null) {
                    synchronized (apyr.class) {
                        if (apyr.c == null) {
                            apyr.c = (ahbe)new agzb((agzi)apyr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apyr.a;
            }
            case 4: {
                return new agza((agzi)apyr.a);
            }
            case 3: {
                return new apyr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
