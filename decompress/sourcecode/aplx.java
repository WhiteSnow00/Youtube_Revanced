import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplx extends agzi implements ahax
{
    public static final agzr a;
    public static final aplx b;
    private static volatile ahbe h;
    public agzq c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;
    
    static {
        a = (agzr)new altr(13);
        agzi.registerDefaultInstance(aplx.class, b = new aplx());
    }
    
    private aplx() {
        this.c = agzi.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aplx.h) == null) {
                    synchronized (aplx.class) {
                        if (aplx.h == null) {
                            aplx.h = (ahbe)new agzb((agzi)aplx.b);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aplx.b;
            }
            case 4: {
                return new agza((agzi)aplx.b);
            }
            case 3: {
                return new aplx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplx.b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002\u100b\u0000\u0003\u100b\u0001\u0004\u100b\u0002\u0005\u100b\u0003", new Object[] { "i", "c", aplw.a(), "d", "e", "f", "g" });
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
