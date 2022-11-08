import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnt extends agzi implements ahax
{
    public static final agnt a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance(agnt.class, a = new agnt());
    }
    
    private agnt() {
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
                if ((c = agnt.c) == null) {
                    synchronized (agnt.class) {
                        if (agnt.c == null) {
                            agnt.c = (ahbe)new agzb((agzi)agnt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agnt.a;
            }
            case 4: {
                return new agza((agzi)agnt.a);
            }
            case 3: {
                return new agnt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agnt.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", new Object[] { "b" });
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
