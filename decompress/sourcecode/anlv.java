import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anlv extends agzi implements ahax
{
    public static final anlv a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public agzy e;
    public double f;
    public int g;
    
    static {
        agzi.registerDefaultInstance(anlv.class, a = new anlv());
    }
    
    private anlv() {
        this.c = "";
        this.d = "";
        this.e = agzi.emptyProtobufList();
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
                if ((h = anlv.h) == null) {
                    synchronized (anlv.class) {
                        if (anlv.h == null) {
                            anlv.h = (ahbe)new agzb((agzi)anlv.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anlv.a;
            }
            case 4: {
                return new agza((int[][][])null, (int[])null);
            }
            case 3: {
                return new anlv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anlv.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u001b\u0005\u1000\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", anlu.class, "f", "g", angs.m });
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
