import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdl extends agzi implements ahax
{
    public static final apdl a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(apdl.class, a = new apdl());
    }
    
    private apdl() {
        this.b = ahas.a;
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
                if ((c = apdl.c) == null) {
                    synchronized (apdl.class) {
                        if (apdl.c == null) {
                            apdl.c = (ahbe)new agzb((agzi)apdl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apdl.a;
            }
            case 4: {
                return new agza((agzi)apdl.a);
            }
            case 3: {
                return new apdl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdl.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[] { "b", apdk.a });
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
