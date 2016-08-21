package cn.appsys.service.backend;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.appsys.dao.backend.AppInfoMapper;
import cn.appsys.pojo.AppInfo;

@Service
public class AppInfoServiceImpl implements AppInfoService {
	@Resource
	private AppInfoMapper mapper;
	
	@Override
	public AppInfo getAppInfo(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfo(id);
	}

	@Override
	public List<AppInfo> getAppInfoList(String querySoftwareName,
									Integer queryCategoryLevel1,
									Integer queryCategoryLevel2, Integer queryCategoryLevel3,
									Integer queryFlatformId,Integer currentPageNo,
									Integer pageSize) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoList(querySoftwareName, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, (currentPageNo-1)*pageSize, pageSize);
	}

	@Override
	public int getAppInfoCount(String querySoftwareName,
							Integer queryCategoryLevel1, 
							Integer queryCategoryLevel2,
							Integer queryCategoryLevel3, 
							Integer queryFlatformId)
							throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAppInfoCount(querySoftwareName, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, queryFlatformId);
	}

	@Override
	public boolean updateSatus(Integer status, Integer id) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(mapper.updateSatus(status, id) > 0 ){
			flag = true;
		}
		return flag;
	}
}