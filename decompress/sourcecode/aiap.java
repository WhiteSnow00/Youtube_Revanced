import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiap extends agzi implements ahax
{
    public static final aiap a;
    private static volatile ahbe e;
    public int b;
    public Object c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance((Class)aiap.class, (agzi)(a = new aiap()));
    }
    
    private aiap() {
        this.b = 0;
        this.d = agzi.emptyProtobufList();
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aiap.e) == null) {
                    synchronized (aiap.class) {
                        if (aiap.e == null) {
                            aiap.e = (ahbe)new agzb((agzi)aiap.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aiap.a;
            }
            case 4: {
                return new agza((float[])null, (byte[][][])null);
            }
            case 3: {
                return new aiap();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiap.a, "\u0001\u000f\u0001\u0000\u0001\uf369\ue1e4\u0007\u000f\u0000\u0001\u0000\u0001\u001a\uec71\u3ed5\u103c\u0000\ufef7\u7c5c\u103c\u0000\uf239\u7f1a\u103c\u0000\ue779\u8f06\u103c\u0000\ue17a\u912d\u103c\u0000\ue8c6\u9233\u103c\u0000\uf646\u9cb5\u103c\u0000\ue62a\ua5e7\u103c\u0000\ueacc\ubbb8\u103c\u0000\uf126\ud1e3\u103c\u0000\uefc8\ud249\u103c\u0000\ue950\ud725\u103c\u0000\uf40d\ud787\u103c\u0000\uf369\ue1e4\u0007\u103c\u0000", new Object[] { "c", "b", "d", aozi.class, ahhl.class, aier.class, ahgj.class, airk.class, apkf.class, aptq.class, ajqt.class, aopt.class, anpe.class, aiar.class, anga.class, anis.class, aohb.class });
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
