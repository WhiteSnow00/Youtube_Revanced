import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoef extends agzi implements ahax
{
    public static final aoef a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(aoef.class, a = new aoef());
    }
    
    private aoef() {
        this.b = 0;
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
                if ((d = aoef.d) == null) {
                    synchronized (aoef.class) {
                        if (aoef.d == null) {
                            aoef.d = (ahbe)new agzb((agzi)aoef.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoef.a;
            }
            case 4: {
                return new agza((agzi)aoef.a);
            }
            case 3: {
                return new aoef();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoef.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", ajnp.class });
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
