import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfk extends agzi implements ahax
{
    public static final ajfk a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public int e;
    private byte g;
    
    static {
        final ajfk a2 = new ajfk();
        agzi.registerDefaultInstance(ajfk.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 384293593, ahcm.k, ajfk.class);
    }
    
    private ajfk() {
        this.g = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajfk.f) == null) {
                    synchronized (ajfk.class) {
                        if (ajfk.f == null) {
                            ajfk.f = (ahbe)new agzb((agzi)ajfk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajfk.a;
            }
            case 4: {
                return new agza((agzi)ajfk.a);
            }
            case 3: {
                return new ajfk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfk.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u100c\u0003", new Object[] { "c", "d", "e", ajcg.m });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
