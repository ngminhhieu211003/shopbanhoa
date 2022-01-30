//package vn.fs.controller.admin;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import vn.fs.repository.OrderDetailRepository;
//import vn.fs.repository.UserRepository;
//
//@Controller
//public class ReportController{
//
//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	OrderDetailRepository orderDetailRepository;
//
//	// Thống kê theo sản phẩm được bán ra
//	@GetMapping(value = "/admin/reports")
//	public String report(Model model, Principal principal) throws SQLException {
//		User user = userRepository.findByEmail(principal.getName());
//		model.addAttribute("user", user);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repo();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê theo thể loại được bán ra
//	@RequestMapping(value = "/admin/reportCategory")
//	public String reportcategory(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repoWhereCategory();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê theo sản phẩm từ nhà cung cấp được bán ra
//	@RequestMapping(value = "/admin/reportBrands")
//	public String reportbrands(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repoWhereBrands();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê sản phẩm bán ra theo năm
//	@RequestMapping(value = "/admin/reportYear")
//	public String reportyear(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repoWhereYear();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê sản phẩm bán ra theo tháng
//	@RequestMapping(value = "/admin/reportMonth")
//	public String reportmonth(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repoWhereMonth();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê sản phẩm bán ra theo quý
//	@RequestMapping(value = "/admin/reportQuarter")
//	public String reportquarter(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.repoWhereQUARTER();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//
//	// Thống kê theo người dùng
//	@RequestMapping(value = "/admin/reportOrderCustomer")
//	public String reportordercustomer(Model model, Principal principal) throws SQLException {
//		Customer customer = customerRepository.findByEmail(principal.getName()).get();
//		model.addAttribute("customer", customer);
//
//		OrderDetail orderDetail = new OrderDetail();
//		model.addAttribute("orderDetail", orderDetail);
//		List<Object[]> listReportCommon = orderDetailRepository.reportCustommer();
//		model.addAttribute("listReportCommon", listReportCommon);
//
//		return "admin/statistical";
//	}
//}
