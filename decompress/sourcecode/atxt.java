import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxt extends agzi implements ahax
{
    public static final atxt a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public atxs d;
    
    static {
        agzi.registerDefaultInstance(atxt.class, a = new atxt());
    }
    
    private atxt() {
        this.c = agzi.emptyProtobufList();
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
                if ((e = atxt.e) == null) {
                    synchronized (atxt.class) {
                        if (atxt.e == null) {
                            atxt.e = (ahbe)new agzb((agzi)atxt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxt.a;
            }
            case 4: {
                return new agza((short[][])null, (char[])null);
            }
            case 3: {
                return new atxt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000", new Object[] { "b", "c", "d" });
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
