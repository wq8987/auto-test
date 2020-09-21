package com.dmall.autotest.testcase;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.alibaba.fastjson.JSON;
import com.dmall.autotest.component.scheduling.SchedulingRequest;

public class TestCase {

	@DataProvider
	public static Object[][] caseData(ITestContext context,Method m){
		String testName = context.getCurrentXmlTest().getName();
		System.out.println(String.format("开始执行场景：【%s】中的分组：【%s】方法：【%s】", testName,JSON.toJSONString(context.getIncludedGroups()),m.getName()));
//		场景1
		if("TestPlan1".equals(testName)) {
			if("test1".equals(m.getName())) {
				SchedulingRequest req = JSON.parseObject("{\n" + "	\"scheduleDetailList\": [{\n"
						+ "		\"userId\": 200785,\n" + "		\"userNo\": \"00006106\",\n"
						+ "		\"userName\": \"徐文梅\",\n"
						+ "		 \"shiftList\": [\"shan07\", \"shan07\",\"shan07\",\"shan07\",\"shan07\",\"shan07\",\"shan07\" ],\"checkSiteIdList\": [\"4214\",\"4214\",\"4214\",\"4214\",\"4214\",\"4214\",\"4214\"]	     \n"
						+ "	}],\n" + "	\"siteId\": 123,\n" + "	\"venderId\": 2,\n"
						+ "	\"startDate\": \"2020-10-12\",\n" + "	\"endDate\": \"2020-10-18\",\n"
						+ "	\"shiftNo\": [\"a2\", \"a1\"]\n" + "}", SchedulingRequest.class);
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { req, headMap } };
			}
			if("test2".equals(m.getName())) {
				Map<String, String> parameters = new LinkedHashMap<>();
				parameters.put("siteId", "4212");
				parameters.put("_", "1599908741701");
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { parameters, headMap } };

			}
		}
//		场景2
		if("TestPlan2".equals(testName)) {
			if("test2".equals(m.getName())) {
				Map<String, String> parameters = new LinkedHashMap<>();
				parameters.put("siteId", "4212");
				parameters.put("_", "1599908741701");
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { parameters, headMap } };

			}
			if("test3".equals(m.getName())) {
				Map<String, String> parameters = new LinkedHashMap<>();
				parameters.put("siteId", "4212");
				parameters.put("_", "1599908741701");
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { parameters, headMap } };
			}
		}
//		场景3
		if("TestPlan12".equals(testName)) {
			if("test1".equals(m.getName())) {
				SchedulingRequest req = JSON.parseObject("{\n" + "	\"scheduleDetailList\": [{\n"
						+ "		\"userId\": 200785,\n" + "		\"userNo\": \"00006106\",\n"
						+ "		\"userName\": \"徐文梅\",\n"
						+ "		 \"shiftList\": [\"shan07\", \"shan07\" ],\"checkSiteIdList\": [\"4214\",\"4214\"]	     \n"
						+ "	}],\n" + "	\"siteId\": 123,\n" + "	\"venderId\": 2,\n"
						+ "	\"startDate\": \"2020-10-12\",\n" + "	\"endDate\": \"2020-10-18\",\n"
						+ "	\"shiftNo\": [\"a2\", \"a1\"]\n" + "}", SchedulingRequest.class);
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { req, headMap }};
			}
			if("test2".equals(m.getName())) {
				Map<String, String> parameters = new LinkedHashMap<>();
				parameters.put("siteId", "4212");
				parameters.put("_", "1599908741701");
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { parameters, headMap } };

			}
			if("test3".equals(m.getName())) {
				Map<String, String> parameters = new LinkedHashMap<>();
				parameters.put("siteId", "4212");
				parameters.put("_", "1599908741701");
				Map<String, String> headMap = new HashMap<>();
				headMap.put("Content-Type", "application/json");
				headMap.put("Cookie",
						"test_token_: SEg6bW0jIzE3Mi4yOC4yNDAuMTE2IyNISDptbSMjNGRmZTQjIzlFNTQ3MjMzRjQ4OUMxQjgzMDJFRUZCRjQzMDhGNkY4QjY3ODZGMDQwRjk1MTQ1NEU3RTVFQjFGMDNEMjVCNjQ3RjY3MTZCMDA5MTNEMTAwREVFNEY0NTE5ODMyM0UxNkE1MDY4QjBBMzQ5RkM3MDk1NjRGNjcwMTkzN0RDNjg0RUZGMTM5N0Y3RTE4RDgxRDU0MUE5NzkwRjJDOENFNDI5MDVDMEQxNThBRTRFRjM4NDFFRTZFRTYxQTA1MUNBMUU4M0ZCNjM0RTE4MkQwQ0NBRTAzMjM4RjJGRjk0RDlFQUI1MjY4Qjk4QTY5RTMyODc1NTZGNTQ0RjgxNDJEQkU=; ticket=108470D6B7A4BF9521305B1B9AA3326B70D10DB8666733CD89AC42254154F48DF6DA93518B63B47899127A868E592D8C113D96E9A38AEF38F03200505CC6E597B634E3073ABDB1CD177FB26E7ADA7C51AAB88F5CB5A040D11DD3CC7F86B6B4C9DF973B912ECA513DE67BD36F0C20716876D8CF7CB38E9B59AD7794161EA14E93; test_dmall_vender=1; venderId=1; dmall-locale=zh_CN; dmall-zone=null; _ga=GA1.2.1893359528.1599888490; _gid=GA1.2.1296573176.1599888490; experimentation_subject_id=IjY1NDZiMDliLTYyOGEtNDg0Yi04ZDk0LTc1NjgwNzQxYzYzNyI%3D--2c6df6240c61d205ab5a7e4de25e55c4b4b1b413; data_seq=1; first_session_time=1588734136893; web_session_count=1; session_id=C8E509CA3BB0000222D030501A3B111C; tempid=C8E509CA3BA000024EDCF0291417EA90");
				return new Object[][] { { parameters, headMap } };
			}
		}
		return null;
	}
}
