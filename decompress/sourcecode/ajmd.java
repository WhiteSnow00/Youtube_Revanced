import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmd extends agzi implements ahax
{
    public static final ajmd a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public String d;
    public agzy e;
    public aorm f;
    public boolean g;
    public boolean h;
    public agzy i;
    private byte k;
    
    static {
        final ajmd a2 = new ajmd();
        agzi.registerDefaultInstance((Class)ajmd.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajss.a, (Object)a2, (MessageLite)a2, (agzn)null, 152040444, ahcm.k, (Class)ajmd.class);
    }
    
    private ajmd() {
        this.k = 2;
        this.d = "";
        this.e = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        this.i = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = ajmd.j) == null) {
                    synchronized (ajmd.class) {
                        if (ajmd.j == null) {
                            ajmd.j = (ahbe)new agzb((agzi)ajmd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajmd.a;
            }
            case 4: {
                return new agza((agzi)ajmd.a);
            }
            case 3: {
                return new ajmd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmd.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0002\u0001\u1008\u0000\u0002\u001a\u0005\u1409\u0002\u0006\u1007\u0003\u0007\u1007\u0004\t\u041b", new Object[] { "c", "d", "e", "f", "g", "h", "i", ajme.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
