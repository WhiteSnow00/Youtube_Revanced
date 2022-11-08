import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alth extends agzi implements ahax
{
    public static final alth a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(alth.class, a = new alth());
    }
    
    private alth() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = alth.e) == null) {
                    synchronized (alth.class) {
                        if (alth.e == null) {
                            alth.e = (ahbe)new agzb((agzi)alth.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alth.a;
            }
            case 4: {
                return new agza((agzi)alth.a);
            }
            case 3: {
                return new alth();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alth.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
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
