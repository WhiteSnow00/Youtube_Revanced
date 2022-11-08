import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikb extends agzi implements ahax
{
    private static final aikb a;
    private static volatile ahbe b;
    private String c;
    
    static {
        agzi.registerDefaultInstance(aikb.class, a = new aikb());
    }
    
    private aikb() {
        this.c = "";
    }
    
    public static /* synthetic */ aikb a() {
        return aikb.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aikb.b) == null) {
                    synchronized (aikb.class) {
                        if (aikb.b == null) {
                            aikb.b = (ahbe)new agzb((agzi)aikb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aikb.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aikb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikb.a, "\u0001\u0000", null);
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
