import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooe extends agzi implements ahax
{
    public static final aooe a;
    private static volatile ahbe k;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public String j;
    
    static {
        agzi.registerDefaultInstance((Class)aooe.class, (agzi)(a = new aooe()));
    }
    
    private aooe() {
        this.i = "";
        this.j = "";
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = aooe.k) == null) {
                    synchronized (aooe.class) {
                        if (aooe.k == null) {
                            aooe.k = (ahbe)new agzb((agzi)aooe.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aooe.a;
            }
            case 4: {
                return new agza((agzi)aooe.a);
            }
            case 3: {
                return new aooe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooe.a, "\u0001\b\u0000\u0001\u0001\u0012\b\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u100c\u0004\u0006\u1007\u0005\u0011\u1008\u0010\u0012\u1008\u0011", new Object[] { "b", "c", "d", "e", "f", "g", aonj.f, "h", "i", "j" });
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
