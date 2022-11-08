import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwz extends agzi implements ahax
{
    public static final atwz a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(atwz.class, a = new atwz());
    }
    
    private atwz() {
        this.c = -1;
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
                if ((d = atwz.d) == null) {
                    synchronized (atwz.class) {
                        if (atwz.d == null) {
                            atwz.d = (ahbe)new agzb((agzi)atwz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return atwz.a;
            }
            case 4: {
                return new agza((agzi)atwz.a);
            }
            case 3: {
                return new atwz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", atwy.a() });
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
