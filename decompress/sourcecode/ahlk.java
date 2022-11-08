import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlk extends agzi implements ahax
{
    public static final ahlk a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public boolean e;
    
    static {
        final ahlk a2 = new ahlk();
        agzi.registerDefaultInstance((Class)ahlk.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, (Object)a2, (MessageLite)a2, (agzn)null, 167, ahcm.k, (Class)ahlk.class);
    }
    
    private ahlk() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahlk.f) == null) {
                    synchronized (ahlk.class) {
                        if (ahlk.f == null) {
                            ahlk.f = (ahbe)new agzb((agzi)ahlk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahlk.a;
            }
            case 4: {
                return new agza((agzi)ahlk.a);
            }
            case 3: {
                return new ahlk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "c", "d", "e" });
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
