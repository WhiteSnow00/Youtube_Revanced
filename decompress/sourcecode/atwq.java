import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwq extends agzi implements ahax
{
    public static final atwq a;
    private static volatile ahbe k;
    public int b;
    public long c;
    public int d;
    public agzy e;
    public int f;
    public int g;
    public int h;
    public agzy i;
    public String j;
    
    static {
        agzi.registerDefaultInstance(atwq.class, a = new atwq());
    }
    
    private atwq() {
        this.e = agzi.emptyProtobufList();
        this.i = agzi.emptyProtobufList();
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = atwq.k) == null) {
                    synchronized (atwq.class) {
                        if (atwq.k == null) {
                            atwq.k = (ahbe)new agzb((agzi)atwq.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return atwq.a;
            }
            case 4: {
                return new agza((byte[][][])null);
            }
            case 3: {
                return new atwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atwq.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1002\u0000\u0002\u100b\u0001\u0003\u001a\u0004\u100b\u0002\u0005\u100c\u0003\u0006\u1004\u0004\u0007\u001a\b\u1008\u0005", new Object[] { "b", "c", "d", "e", "f", "g", arbt.f, "h", "i", "j" });
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
