import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiwg extends agzi implements ahax
{
    public static final aiwg a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(aiwg.class, a = new aiwg());
    }
    
    private aiwg() {
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
                if ((e = aiwg.e) == null) {
                    synchronized (aiwg.class) {
                        if (aiwg.e == null) {
                            aiwg.e = (ahbe)new agzb((agzi)aiwg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiwg.a;
            }
            case 4: {
                return new agza((agzi)aiwg.a);
            }
            case 3: {
                return new aiwg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiwg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
