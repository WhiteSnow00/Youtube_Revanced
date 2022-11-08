import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewz extends agzi implements ahax
{
    public static final ewz a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(ewz.class, a = new ewz());
    }
    
    private ewz() {
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
                if ((c = ewz.c) == null) {
                    synchronized (ewz.class) {
                        if (ewz.c == null) {
                            ewz.c = (ahbe)new agzb((agzi)ewz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ewz.a;
            }
            case 4: {
                return new agza((agzi)ewz.a);
            }
            case 3: {
                return new ewz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ewz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ewy.a });
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
