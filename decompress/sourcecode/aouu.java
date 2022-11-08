import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouu extends agzi implements ahax
{
    public static final aouu a;
    public static final agzg b;
    private static volatile ahbe k;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public String j;
    
    static {
        final aouu a2 = new aouu();
        agzi.registerDefaultInstance(aouu.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)amsf.b, a2, (MessageLite)a2, null, 330586086, ahcm.k, aouu.class);
    }
    
    private aouu() {
        agzi.emptyProtobufList();
        this.e = "";
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
                if ((k = aouu.k) == null) {
                    synchronized (aouu.class) {
                        if (aouu.k == null) {
                            aouu.k = (ahbe)new agzb((agzi)aouu.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aouu.a;
            }
            case 4: {
                return new agza((agzi)aouu.a);
            }
            case 3: {
                return new aouu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aouu.a, "\u0001\u0007\u0000\u0001\u0002\u000e\u0007\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001\u0005\u1007\u0002\t\u100c\u0005\f\u100c\b\r\u100c\t\u000e\u1008\n", new Object[] { "c", "d", amuv.a(), "e", "f", "g", ajcg.j, "h", aotc.k, "i", aotc.i, "j" });
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
