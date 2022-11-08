import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxy extends agzi implements ahax
{
    public static final apxy a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(apxy.class, a = new apxy());
    }
    
    private apxy() {
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
                if ((c = apxy.c) == null) {
                    synchronized (apxy.class) {
                        if (apxy.c == null) {
                            apxy.c = (ahbe)new agzb((agzi)apxy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxy.a;
            }
            case 4: {
                return new agza((agzi)apxy.a);
            }
            case 3: {
                return new apxy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
