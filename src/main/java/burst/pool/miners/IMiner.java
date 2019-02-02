package burst.pool.miners;

import burst.kit.entity.BurstAddress;
import burst.kit.entity.BurstValue;

public interface IMiner {
    void processNewDeadline(Deadline deadline);
    void recalculateCapacity(long currentBlockHeight);
    void recalculateShare(double poolCapacity);
    void increasePending(BurstValue delta);
    void decreasePending(BurstValue delta);
    BurstValue takeShare(BurstValue availableReward);
    double getCapacity();
    BurstValue getPending();
    BurstAddress getAddress();
    double getShare();
    int getNConf();
    String getName();
    void setName(String name);
    String getUserAgent();
    void setUserAgent(String userAgent);
}
