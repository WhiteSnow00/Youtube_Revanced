import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeti extends agzi implements ahax
{
    public static final aeti a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public ahas d;
    
    static {
        agzi.registerDefaultInstance(aeti.class, a = new aeti());
    }
    
    private aeti() {
        this.d = ahas.a;
        this.c = "";
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
                if ((e = aeti.e) == null) {
                    synchronized (aeti.class) {
                        if (aeti.e == null) {
                            aeti.e = (ahbe)new agzb((agzi)aeti.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeti.a;
            }
            case 4: {
                return new agza((agzi)aeti.a);
            }
            case 3: {
                return new aeti();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeti.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1008\u0000\u00022", new Object[] { "b", "c", "d", aeth.a });
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
